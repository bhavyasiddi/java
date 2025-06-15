public class CRMData {
    public static void main(String[] args){

    //Entities for Customer

String customerId = "CUST12345";
String customerName = "ELSA";
String email = "elsa@example.com";
int phoneNumber = 12345678;
String address = "12482 Craig ST, New York, NY";
String registrationDate = "06/13/2025";

System.out.println("Customer ID is : " + customerId);
System.out.println("Customer Name is : " + customerName);
System.out.println("Customer Email is : " + email);
System.out.println("Customer Contact Number is : " + phoneNumber);
System.out.println("Customer Address is : " + address);
System.out.println("Customer Registered Date is : " + registrationDate);

System.out.println("---------------------------------------------------------------");
//Entites for sales lead

String leadId = "LEAD67890";
String leadName = "Scarlett Johanson";
String leadEmail = "scarlett@example.com";
String leadSource = "LinkedIn";
boolean isLead = true;

System.out.println("Sales Lead ID is : " + leadId);
System.out.println("Sales Lead Name is : " + leadName);
System.out.println("Sales Lead Email is : " + leadEmail);
System.out.println("Sales Lead source is : " + leadSource);
System.out.println("Is a Sales Lead : " + isLead);

System.out.println("---------------------------------------------------------------");

//Entities for Interactions

String interactionId = "INT001";
String customerId = "CUST12345";  
String interactionType = "Email";  //  Call, Email, Meeting
String interactionDate = "06/13/2025";
String notes = "Discussed product features and pricing.";

System.out.println("Interaction ID is : " + interactionId);
System.out.println("Interaction Customer ID is: " + customerId);
System.out.println("Interaction type is : " + interactionType);
System.out.println("Interacted Data is : " + interactionDate);
System.out.println("Notes on what interaction is about : " + notes);

System.out.println("---------------------------------------------------------------");

//Entities for Sales Opportunity
String opportunityId = "OPP001";
String customerId = "CUST12345";  
String opportunityName = "Enterprise Software Deal";
double estimatedValue = 15000.00;
String stage = "Negotiation";  // Prospecting, Proposal, Closed 
String expectedCloseDate = "06/13/2025";

System.out.println("Opportunity ID is : " + opportunityId);
System.out.println("Customer ID is : " + customerId);
System.out.println("Opportunity Name is : " + opportunityName);
System.out.println("Opportunity's Estimated value is : " + estimatedValue);
System.out.println("Opportunity Stage is : " + stage);
System.out.println("Opportunity Date occurred is on : " + expectedCloseDate);

System.out.println("---------------------------------------------------------------");

//Entities for Ticket
String ticketId = "TKT1001";
String customerId = "CUST12345";   
String issueDescription = "Login not working on mobile app.";
String status = "Open";  // e.g., Open, In Progress, Closed
String ticketDate = "06/13/2025";
int priority = 2;  // 1 - High, 2 - Medium, 3 - Low

System.out.println("Ticket ID is :" + ticketId);
System.out.println("Customer ID for the ticket is :" + customerId);
System.out.println("Ticket issue is about :" + issueDescription);
System.out.println("Status of the ticket is :" + status);
System.out.println("Ticket ID date is :" + ticketDate);
System.out.println("Ticket Priority is :" + priority);





    }
}
