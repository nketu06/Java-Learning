package org.example.differentClasses;

public class Main {
    public static void main(String[] args) {

        // static class
        StaticExm staticExm = new StaticExm();
        System.out.println(staticExm.getName());
        StaticExm.MyStaticClass myStaticClass = new StaticExm.MyStaticClass("Static class in eg");
        System.out.println(myStaticClass.getName());

        // Member or inner class
        MemberOrInner outerMember = new MemberOrInner();
        MemberOrInner.Inner innerClass = outerMember.new Inner();
        innerClass.display();

        // Local
        Local local = new Local();
        local.outerMethod();  // Output: Inside Local Inner Class

        // using anonymous class, can be used in place of lambda exp, when more than one abs method
        PaymentAccept paymentAccept = new PaymentAccept();
        paymentAccept.getPaymet(new Payment() {
            @Override
            public void pay() {
                System.out.println("Payment accepted");
            }

            @Override
            public void cancel() {
                return;
            }
        });


    }
}
