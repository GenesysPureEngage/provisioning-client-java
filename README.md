# Provisioning Client Library


The Provisioning Client Library is a Java wrapper for the [Provisioning API](/api/reference/provisioning/) that makes it easier to code against the API. The library provides much of the supporting code needed to make HTTP requests and process HTTP responses.

The library is hosted on [GitHub](https://github.com/GenesysPureEngage/provisioning-client-java) and Genesys welcomes pull requests for corrections.

## Install

Genesys recommends that you install the Provisioning Library JAR file with [Gradle](https://gradle.org). You should use latest version available in the Maven [repository](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.genesys%22%20AND%20a%3A%22provisioning%22).

Add the following line to the **dependencies** block in your **build.gradle** file:

~~~gradle
compile 'com.genesys:provisioning:<latest_version>'
~~~

## Related Links

* The following Provisioning API tutorials demonstrate some ways you can use this library:
  * [Create user](/tutorials/create-user-provisioning-java/)
* Learn more about the [Provisioning API](/api/reference/provisioning/).
* Learn more about the [Provisioning Client Library](/api/client-libraries/provisioning/).

## Classes

The Provisioning Client Library includes the following classes:

* [ExportApi](/api/client-libraries/provisioning/java/ExportApi/index.html)
* [ImportApi](/api/client-libraries/provisioning/java/ImportApi/index.html)
* [ObjectsApi](/api/client-libraries/provisioning/java/ObjectsApi/index.html)
* [OperationsApi](/api/client-libraries/provisioning/java/OperationsApi/index.html)
* [OptionsApi](/api/client-libraries/provisioning/java/OptionsApi/index.html)
* [SessionApi](/api/client-libraries/provisioning/java/SessionApi/index.html)
* [UsersApi](/api/client-libraries/provisioning/java/UsersApi/index.html)

These classes contains all the resources and events that are part of the Provisioning API, along with all the methods you need to access the API functionality.

## Examples

Here's an example of how you can use the Provisioning Client Library to create a new user.

~~~ java
import com.genesys.common.ApiClient;
import com.genesys.provisioning.api.SessionApi;
import com.genesys.provisioning.api.UsersApi;
import com.genesys.provisioning.model.AddUserData;
import com.genesys.provisioning.model.ApiSuccessResponse;
import com.genesys.provisioning.model.LoginData;
import com.genesys.provisioning.model.LoginSuccessResponse;
import java.net.CookieManager;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        final String apiKey = "<apiKey>";
        final String username = "<username>";
        final String password = "<password>";
        final String apiUrl = "<apiUrl>";

        final String provisioningUrl = String.format("%s/provisioning/v3", apiUrl);

        //Initialize API Client
        //Create and setup ApiClient instance with your ApiKey and Provisioning API URL.

        final ApiClient client = new ApiClient();
        client.setBasePath(provisioningUrl);
        client.addDefaultHeader("x-api-key", apiKey);
        client.getHttpClient().setCookieHandler(new CookieManager());
        client.setDebugging(true);

        //Create SessionApi instance
        //Creating instance of SessionApi using the ApiClient.
        final SessionApi sessionApi = new SessionApi(client);

        //Logging in Provisioning API
        //Logging in using our username and password
        LoginData loginData = new LoginData();
        loginData.setDomainUsername(username);
        loginData.setPassword(password);
        LoginSuccessResponse loginResp = sessionApi.login(loginData);
        if (loginResp.getStatus().getCode() != 0) {
            throw new Exception("Cannot log in");
        }

        //Creating instance of UsersApi using the ApiClient
        final UsersApi usersApi = new UsersApi(client);

        //Filling necessary information and creating a user using UsersApi instance
        AddUserData usersData = new AddUserData();
        usersData.setUserName("<agentUsername>");
        usersData.setPassword("<agentPassword>");
        usersData.setFirstName("<agentFirstName>");
        usersData.setLastName("<agentLastName>");
        usersData.setAccessGroups(Arrays.asList("<agentAccessGroup>"));
        ApiSuccessResponse resp = usersApi.addUser(usersData);
        if (resp.getStatus().getCode().equals(0)) {
            System.out.println("user created");
        }
        else {
            System.err.println(resp);
            System.err.println("Cannot create agent");
        }

        //Ending our Provisioning API session
        sessionApi.logout();
    }
}
~~~

For usage examples for each method available in the library, see the documentation for the classes.
