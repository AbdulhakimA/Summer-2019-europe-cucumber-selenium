$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountTypes.feature");
formatter.feature({
  "name": "Account types",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Contacts test with email",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as a \"store manager\"",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_user_logged_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates \"Customers\" \"Contacts\"",
  "keyword": "And "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_user_navigates(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click the \"mbrackstone9@example.com\" from contacts",
  "keyword": "When "
});
formatter.match({
  "location": "ContactsStepDefs.the_user_click_the_from_contacts(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ctd class\u003d\"string-cell editable view-mode prevent-text-selection-on-dblclick grid-cell grid-body-cell grid-body-cell-email\" data-column-label\u003d\"Email\"\u003e...\u003c/td\u003e is not clickable at point (442, 316). Other element would receive the click: \u003cdiv class\u003d\"loader-mask shown\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d76.0.3809.100)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027iPhonevmadjawad\u0027, ip: \u0027fe80:0:0:0:c58:1588:b877:775c%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.100, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: /var/folders/kp/p_xgsm5s3m5...}, goog:chromeOptions: {debuggerAddress: localhost:57816}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 57018f2da94a8c2d9db37dd4b186a330\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat com.vytrack.step_definitions.ContactsStepDefs.the_user_click_the_from_contacts(ContactsStepDefs.java:54)\n\tat ✽.the user click the \"mbrackstone9@example.com\" from contacts(file:src/test/resources/features/AccountTypes.feature:41)\n",
  "status": "failed"
});
formatter.step({
  "name": "the information should be the same with database",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepDefs.the_information_should_be_the_same_with_database()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});