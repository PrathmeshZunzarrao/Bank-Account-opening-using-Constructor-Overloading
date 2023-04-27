class BankAccount
{
    String name;
    long mob;
    String address;
    int pincode;
    long adharNo;
    String emailID;
    String religion;
    String race;
    
    
    BankAccount()
    {
        // Default Constructor
    }
    
    BankAccount(String name, long mob, String address, int pincode, long adharNo)
    {
        this.name = name;
        this.mob = mob;
        this.address = address;
        this.adharNo = adharNo;
    }
    
    BankAccount(String name, long mob, String address, int pincode, long adharNo, String emailID)
    {
        this.name = name;
        this.mob = mob;
        this.address = address;
        this.adharNo = adharNo;
        this.emailID = emailID;
    }
    
    BankAccount(String name, long mob, String address, int pincode, long adharNo, String emailID, String religion)
    {
        this.name = name;
        this.mob = mob;
        this.address = address;
        this.adharNo = adharNo;
        this.emailID = emailID;
        this.religion = religion;
    }
    
    BankAccount(String name, long mob, String address, int pincode, long adharNo, String emailID, String religion, String race)
    {
        this.name = name;
        this.mob = mob;
        this.address = address;
        this.adharNo = adharNo;
        this.emailID = emailID;
        this.religion = religion;
        this.race = race;
    }
    
    
    public void ShowData()
    {
        System.out.println("=========Details of Customer=========");

        System.out.println("Name of Customer : " + name);
        System.out.println("Contact No  : " + mob);
        System.out.println("Address  : " + address);
        System.out.println("Id Proof(AdharCard No / Pancard) : " + adharNo);
        System.out.println("Email ID : " + emailID);
        System.out.println("Religion  : " + religion);
        System.out.println("Race : " + race);


        System.out.println("=========Thank You=========");
    }
    
    
}