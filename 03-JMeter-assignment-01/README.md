## JMeter Assignment 01

#### **Question**

- Find out the actual TPS for if 10000 user can give load within 1 hour **Expected load:** 10000 user, per hour.
- **Actual load:** what TPS? Breakdown the expected TPS in excel sheet and find out the actual TPS.
- For 60s, 300s and 600s load, add Jmeter UI screenshot and for 900s generate html report and take screenshot.

#### **Load Test Strategy**

- [Server](https://demoqa.com/BookStore/v1/Books)

| ![TPS Report](./Images/TPS_report.png) |
| :------------------------------------: |
|              _Actual TPS_              |

#### **JMeter Summary Report**

- 167 users for 60 seconds

| ![Test Case 1](./Images/test_01.png) |
| :----------------------------------: |
|         _60 sec, 167 users_          |

- 833 users for 300 seconds

| ![Test Case 2](./Images/test_02.png) |
| :----------------------------------: |
|         _300 sec, 833 users_         |

- 1667 users for 600 seconds

| ![Test Case 3](./Images/test_03.png) |
| :----------------------------------: |
|        _600 sec, 1667 users_         |

- 1667 users for 650 seconds

| ![Test Case 4](./Images/test_04.png) |
| :----------------------------------: |
|        _650 sec, 1667 users_         |

- 2500 users for 900 seconds

| ![Test Case 5](./Images/test_05_02.png) |
| :-------------------------------------: |
|          _900 sec, 2500 users_          |

- 2500 users for 950 seconds

| ![Test Case 6](./Images/test_06_02.png) |
| :-------------------------------------: |
|          _950 sec, 2500 users_          |

| ![Test Summary Report](./Images/reports.png) |
| :------------------------------------------: |
|               _Summary Report_               |
