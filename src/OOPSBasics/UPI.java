package OOPSBasics;

public class UPI implements PaymentMethods{
    private String upiId;

    UPI(String upiId){
        this.upiId = upiId;
    }


    @Override
    public void pay() {
        System.out.println("Making payment via UPI: " + upiId);
    }
}
