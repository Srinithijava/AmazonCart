# AmazonCart
AmazonPurchasecartflow
<snippet>
  <content><![CDATA[
# ${1:AmazonProdPurchase}
TODO: To select the 5th available Best seller digital cameras from amazon.com and validate the selected product and price in cart
## Installation
TODO: Create a Maven project and add selenium, cucumber and cucumber-extent reports dependencies to pom.xml
## Usage
TODO: 1.src/main/java package has Pageobjects and page actions packages - No of pages and it's objects can be added under these packages and and config file reader and file reader manager classes for formatting chrome path and xml path's managed under datasetup package
2.src/test/java package has features package, runner package and step definition package to run the BDD scenarios 
3. src/main/resources package has drivers 
4.configs folder has congiguration.properties and extent reports config xml 
5. targets folder has the cucumber reports 
## Contributing
1. After adding the page objects and it's action methods to their packages call those methods to the step definition class as required for the feature file scenarios
2. After mapping the methods to the step definition class, Execute the runner class and verify the report
3. Create your feature branch: `git checkout -b my-new-feature`
4. Commit your changes: `git commit -am 'Adding some feature'`
5. Push to the branch: `git push origin my-new-feature`
6. Submit a pull request :D
]]></content>
  <tabTrigger>readme</tabTrigger>
</snippet>
