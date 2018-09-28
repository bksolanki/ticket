# ticket

This is a java application built using maven and mysql.

The external libraries used are 

1) GSON
2) mysql connectors
3) jooq for making table classes
4) quartz-scheduler for automated releases of holds after

## Steps to run

1) A mysql database server is needed to run the application. currently the address is jdbc:mysql://localhost:3306/sales?serverTimezone=UTC
NOTE: Server time and system time should be in the same timezone for release to happen in the expected time range. else, the release will behave differently.
2) In that server, please run the script "tables_queries.sql"

3) Please change the database url in pom.xml, App.java and Release.java
from "jdbc:mysql://localhost:3306/sales?serverTimezone=UTC" to your database url.
Also assign the correct username and password for the same.

4) Run a Project clean
5) Maven clean, Maven build -> initialize
6) Select the project and "Run as Java Application"

The first statement you will see is "Items available".
Where you will be shown the section, row and seat of the available seats along with their itemids.

You should enter the number of items you want to reserve and press enter.

then, provide the item_id of items you wish to reserve

Then provide the email address with which you want to reserve the item
with.
NOTE: You wont be able to place items on hold for email adresses that do not exist in the customer table.

If Hold is successful, you will be provided a unique orderid.

Then, you will be asked to invoice the items you put on hold. Please note that the items can only be purchased when they are on hold, the invoice request must contain the exact orderid and same customer email address it was put on hold with.

Then enter the Order id
Next, text will ask you to enter the email address associated with your hold.

If the invoice is successful, you will recieve an invoice id.

If you fail to invoice out the held orders in 60 seconds, the hold will be released automatically.


### Tables

#### Event
This table has eventid and associated event information. Each event at the venue is given a unique id

#### Customer
Each customer is given a unique cust_id. We later use this to map the email address

### Item_reserve

This table contains the orderid, item_ids and hold_expiration fields. The table will be populated and emptied based on hold expiration time and items which are placed on hold.

### Item

This is the most important table. items table consists of 

1) Item_id : a unique item_id for each ticket.
2) Barcods: The value of barcodes of the tickets.
3) Shared flag: The stakeholders of the tickets, some times choose not to allow purchasing or invoicing of the tickets for buisenss/other reasons. So if the item is not shared, it wont be available to hold or invoice.
4) ticketgroup: each ticket can be segregated in ticketgroups based on buiseness needs, and bulk actions can be taken. For eg: Tickets in a particaly section belong to one ticketgroup and are priced lower. than other. This functionality is not used in this project, but code can be modified to allow it.
5) item_status: This field shows which statius the item is in. The acceptable values are "available", "ON_HOLD", "sold". This rule is not enforced currently. But if the item goes to any other status, it will be unavailable.

6) external notes and internal notes: These fields are used during processing of holds and invoices. They can also be used to comments from stakeholders.

7) Orderid: This field is associated to the unique hold id provided when hold is succesful.However, the value is assigned only when the item is invoiced out.

8) Invoice ID: This filed is populated when we have a succesful invoice.

Other fields are self explanatory in this table.



