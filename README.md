# swagger-java-client

Beneficiary account pre-validation
- API version: 1.0.7-oas3
  - Build date: 2019-06-19T14:51:56.123420-04:00[America/New_York]

Move your app forward with the Account Pre-Validation API


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.swift.gpi.preval.*;
import com.swift.gpi.preval.auth.*;
import com.swift.gpi.preval.model.*;
import com.swift.gpi.preval.api.VerifyAccountApi;

import java.io.File;
import java.util.*;

public class VerifyAccountApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: SwiftLAU
        ApiKeyAuth SwiftLAU = (ApiKeyAuth) defaultClient.getAuthentication("SwiftLAU");
        SwiftLAU.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //SwiftLAU.setApiKeyPrefix("Token");

        VerifyAccountApi apiInstance = new VerifyAccountApi();
        AccountVerificationRequest body = new AccountVerificationRequest(); // AccountVerificationRequest | Verify Account Details Request.
        String laUApplicationID = "laUApplicationID_example"; // String | ID that identifies the application generating the API and used by the gpi Connector to retrieve the related LAU keys, required for consumers using gpi connector only
        String laUVersion = "laUVersion_example"; // String | version of the LAUSigned header. Mandatory. \"1.0\" for this first release, required for consumers using gpi connector only
        String laUCallTime = "laUCallTime_example"; // String | timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ, required for consumers using gpi connector only
        String laURequestNonce = "laURequestNonce_example"; // String | a random value generated by the client consumer. Provided with the request and copied by the gpi Connector on the response, required for consumers using gpi connector only
        String laUSigned = "laUSigned_example"; // String | service specific HTTP headers composed of apiKey, rbac role and bic to route the request, required for consumers using gpi connector only
        String laUSignature = "laUSignature_example"; // String | contains the LAU (SHA256) signature, base64 encoded, required for consumers using gpi connector only
        String xBic = "xBic_example"; // String | describe the BIC for SWIFT to route the request, providers get the value and consumers are not required to fill it in
        String subjectDN = "subjectDN_example"; // String | describe the distinguish name of the consumer, providers get the value and consumers are not required to fill it in
        String institution = "institution_example"; // String | describe the BIC of the consumer, providers get the value and consumers are not required to fill it in
        try {
            AccountVerificationResponse1 result = apiInstance.verifyAccount(body, laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xBic, subjectDN, institution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerifyAccountApi#verifyAccount");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://apigtw-test.swiftnet.sipn.swift.com/swift-preval-pilot*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*VerifyAccountApi* | [**verifyAccount**](docs/VerifyAccountApi.md#verifyAccount) | **POST** /v1/accounts/verification | Verify that a beneficiary account could be able to receive incoming funds.

## Documentation for Models

 - [AccountValidationCheckContext1Code](docs/AccountValidationCheckContext1Code.md)
 - [AccountValidationResponse1Code](docs/AccountValidationResponse1Code.md)
 - [AccountValidationResponse2Code](docs/AccountValidationResponse2Code.md)
 - [AccountValidationResponse3Code](docs/AccountValidationResponse3Code.md)
 - [AccountVerificationRequest](docs/AccountVerificationRequest.md)
 - [AccountVerificationResponse1](docs/AccountVerificationResponse1.md)
 - [ClearingSystemIdentification2Choice](docs/ClearingSystemIdentification2Choice.md)
 - [ClearingSystemMemberIdentification2](docs/ClearingSystemMemberIdentification2.md)
 - [ErrorCodeConsumer](docs/ErrorCodeConsumer.md)
 - [FinancialInstitutionIdentification20](docs/FinancialInstitutionIdentification20.md)
 - [GenericOrganisationIdentification1](docs/GenericOrganisationIdentification1.md)
 - [OrganisationIdentificationSchemeName1Choice](docs/OrganisationIdentificationSchemeName1Choice.md)
 - [PostalAddress26](docs/PostalAddress26.md)
 - [StatusCodeConnector](docs/StatusCodeConnector.md)
 - [ValidationCheckReponse1](docs/ValidationCheckReponse1.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### SwiftLAU

- **Type**: API key
- **API key parameter name**: LAUSignature
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


