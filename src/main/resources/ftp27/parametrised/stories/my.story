
Scenario: A scenario for check temperature table

Given a patient is <patient>
When patient temperature is <temperature>
Then temperature is <result>

Examples:
|patient|temperature|result|
|1|38.0|low|
|1|39.0|normal|
|1|39.8|high|
|2|40.0|low|
|2|42.2|normal|
|2|43.8|high|
|3|35.2|low|
|3|36.6|normal|
|3|38.0|high|
|3|36.7|normal|
|3|36.7|high|
