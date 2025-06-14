class CRMOperaotrs {
    public static void main(String[] args){
    int customerId = 35;
    String customerName = "T'Chala";
    double totalPurchases = 4500.0;
    int noofPurchases = 3;
    int interationCount = 7;
    int leadId = 134;
    double leadBudget = 3457.90;
    boolean isContacted = true;
    double opportunityValue = 5689.67;
    boolean isClosed = false;
  
    //calcualting avg purchase value

        double avg = totalPurchases / noofPurchases;

    //checking sales opportunity value

        boolean salesOpportunity = opportunityValue >= 5000;

    //check if lead should be prioritized
        boolean isleadContacted = isContacted && !isClosed;
        boolean isPrioritized = leadBudget > 3000;

    // Increasing the interaction count

        interationCount++;

    System.out.println("Average is : " +avg);
    System.out.println("sales opportunity value is higher than the Opportunity value : " + salesOpportunity);
    System.out.println("Lead should be prioritized " + isleadContacted);
    System.out.println("Lead is  contacted " + isPrioritized);
    System.out.println("New Interaction count is :" + interationCount);






    }
}