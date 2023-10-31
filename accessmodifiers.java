public class accessmodifiers {
    public static void main(String[] args) {
        PublicAccessModifier publicDemo = new PublicAccessModifier();
        System.out.println(publicDemo.publicVariable);
        publicDemo.publicMethod();

        PrivateAccessModifier privateDemo = new PrivateAccessModifier();
       
        ProtectedAccessModifier protectedDemo = new ProtectedAccessModifier();
        System.out.println(protectedDemo.protectedVariable);
        protectedDemo.protectedMethod();

        DefaultAccessModifier defaultDemo = new DefaultAccessModifier();
        System.out.println(defaultDemo.defaultVariable);
        defaultDemo.defaultMethod();
    }
}