# SampleOpensourceHash

## Steps to intigrate our API

1) Register your account with valid Email address from http://trudata.io

2) Login with authentication details.

3) Once admin activate your account you can access API_KEY.
(Note :- Usually it will take 24 hours to aprove your account)

4) Once account activated you can find API_KEY in settings tab.

5) Installation : Android Studio (or Gradle) No need to clone the repository or download any files -- just add this line to your app's build.gradle inside the dependencies section:

```
 compile 'com.opensourcehash:opendatahash:1.0.0'
                    (or)
 implementation 'com.opensourcehash:opendatahash:1.0.0' if you are using Android Studio version 3.0
```

Note: We recommend you to use

```
 compile 'com.opensourcehash:opendatahash:1.+'
```

Usage : To initiate our library, place the below code at initial activity of your application(ex: splash activity).

OpendataHashApp.initialize(context, apiKey, emailId_SHA256_Hash, advertiserId);
```
context -> your application context
apiKey -> your registered application API key from http://trudata.io
emailIdHash -> primary emailId from the mobile in SHA-256 hash encryption formate
advertiserId -> it is the google advertiserId from the mobile.
```
implement OpenDataCallbacks in the same Activity where you are calling above initialize() method, so that Callback methods will be overriden and you can redirect the user accourdingly with success, failure functions accordingly.

MainActivity extends AppCompatActivity implements OpenDataHashCallbacks
```
@Override public void onDataSuccess(String message, String data) { 
  //TODO for successful request with data as response

}

@Override
 public void onDataFailure(String message) {
    //TODO for failure with failure message.

}
```
