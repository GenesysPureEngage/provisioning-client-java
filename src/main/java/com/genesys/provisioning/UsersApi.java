package com.genesys.provisioning;

import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;

import com.genesys.internal.provisioning.model.ApiSuccessResponse;
import com.genesys.internal.provisioning.model.CreateUserSuccessResponse;
import com.genesys.internal.provisioning.model.AddUserData;
import com.genesys.internal.provisioning.model.UpdateUserData;
import com.genesys.internal.provisioning.model.GetUsersSuccessResponse;

import com.genesys.provisioning.models.User;
import com.genesys.provisioning.models.Person;
import com.genesys.provisioning.models.Converters;
import com.genesys.provisioning.models.UserSearchParams;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class UsersApi {
	private com.genesys.internal.provisioning.api.UsersApi usersApi;

	public UsersApi(ApiClient client) {
		usersApi = new com.genesys.internal.provisioning.api.UsersApi(client);
	}
	/**
	 * Creates a user ([CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson)) with the given attributes.
	 * @param user The user to be created. (required)
	 * @throws ProvisioningApiException if the call is unsuccessful.
	 * @return Person a Person object with info on the user created.
	 */
	public Person addUser(User user) throws ProvisioningApiException {
		try {
			CreateUserSuccessResponse resp = usersApi.addUser(new AddUserData().data(Converters.convertUserToAddUserDataData(user)));

			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error adding user. Code: " + resp.getStatus().getCode());
			}

			return Converters.convertCreateUserSuccessResponseDataPersonToPerson(resp.getData().getPerson());
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error adding user", e);
        }
	}
	/**
	 * Deletes a user with the given DBID.
	 * @param userDBID The DBID of the user to be deleted. (required)
	 * @param keepPlaces If null or false the user's places and DNs are not deleted. (optional)
	 * @throws ProvisioningApiException if the call is unsuccessful.
	 */
	public void deleteUser(String userDBID, Boolean keepPlaces) throws ProvisioningApiException {
		try {
			ApiSuccessResponse resp = usersApi.deleteUser(userDBID, keepPlaces);

			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error deleting user. Code: " + resp.getStatus().getCode());
			}
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error deleting user", e);
        }
	}

	/**
 	 * Updates the attributes of a user with the given DBID.
 	 * @param userDBID the DBID of the user to be updated. (required)
	 * @param user the new attributes of the user. (required)
	 * @throws ProvisioningApiException if the call is unsuccessful.
	 */
	public void updateUser(String userDBID, User user) throws ProvisioningApiException {
		try {
			ApiSuccessResponse resp = usersApi.updateUser(userDBID, new UpdateUserData().data(Converters.convertUserToUpdateUserDataData(user)));

			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error updating user. Code: " + resp.getStatus().getCode());
			}
        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error updating user", e);
        }
	}

	/**
     * Get users.
     * Get [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) objects based on the specified filters.
     * @param limit Limit the number of users the Provisioning API should return. (optional)
     * @param offset The number of matches the Provisioning API should skip in the returned users. (optional)
     * @param order The sort order. (optional)
     * @param sortBy A comma-separated list of fields to sort on. Possible values are firstName, lastName, and userName.  (optional)
     * @param filterName The name of a filter to use on the results. (optional)
     * @param filterParameters A part of the users first or last name, if you use the FirstNameOrLastNameMatches filter.  (optional)
     * @param roles Return only users who have the Workspace Web Edition roles. The roles can be specified in a comma-separated list. Possible values are ROLE_AGENT and ROLE_ADMIN,ROLE_SUPERVISOR.  (optional)
     * @param skills Return only users who have these skills. The skills can be specified in a comma-separated list.  (optional)
     * @param userEnabled Return only enabled or disabled users. (optional)
     * @return The list of users found for the given parameters.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public List<User> getUsers(Integer limit, Integer offset, String order, String sortBy, String filterName, String filterParameters, String roles, String skills, Boolean userEnabled) throws ProvisioningApiException {
		List<User> out = new ArrayList();

		try {
			GetUsersSuccessResponse resp = usersApi.getUsers(limit, offset, order, sortBy, filterName, filterParameters, roles, skills, userEnabled);

			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error getting users. Code: " + resp.getStatus().getCode());
			}

			for(Object i:resp.getData().getUsers()) {
				out.add(new User((Map<String, Object>)i));
			}

        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting users", e);
        }

        return out;
	}

	/**
     * Get users.
     * Get [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) objects based on the specified filters.
     * @param searchParams an object containing the search parameters. Parameters include (limit, offset, order, sortBy, filterName, filterParameters, roles, skills, userEnabled, userValid).
     * @return The list of users found for the given parameters.
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public List<User> getUsers(UserSearchParams searchParams) throws ProvisioningApiException {
		return getUsers(
			searchParams.getLimit(),
			searchParams.getOffset(),
			searchParams.getOrder(),
			searchParams.getSortBy(),
			searchParams.getFilterName(),
			searchParams.getFilterParameters(),
			searchParams.getRoles(),
			searchParams.getSkills(),
			searchParams.getUserEnabled()
		);
	}

	/**
     * Get a user.
     * Get the specified [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) object.
     * @param DBID The user&#39;s DBID. (required)
     * @return User
     * @throws ProvisioningApiException if the call is unsuccessful.
     */
	public User getUser(String DBID) throws ProvisioningApiException {

		try {
			GetUsersSuccessResponse resp = usersApi.getUser(DBID);

			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error getting user. Code: " + resp.getStatus().getCode());
			}
			return new User((Map<String, Object>)resp.getData().getUser());

        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting user with DBID: " + DBID, e);
        }
	}

	 /**
     * Get the logged in user.
     * Get the [CfgPerson](https://docs.genesys.com/Documentation/PSDK/latest/ConfigLayerRef/CfgPerson) object for the currently logged in user.
   	 * @return the current User.
   	 * @throws ProvisioningApiException if the call is unsuccessful.
   	 */
	public User getCurrentUser() throws ProvisioningApiException {

		try {
			GetUsersSuccessResponse resp = usersApi.getCurrentUser();

			if (!resp.getStatus().getCode().equals(0)) {
				throw new ProvisioningApiException("Error getting current user. Code: " + resp.getStatus().getCode());
			}
            return new User((Map<String, Object>)resp.getData().getUser());

        } catch(ApiException e) {
        	throw new ProvisioningApiException("Error getting current user", e);
        }
	}

}
