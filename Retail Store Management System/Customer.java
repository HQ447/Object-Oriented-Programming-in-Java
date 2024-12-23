
//Customer Class
class Customer
{
    private String idNo;
    private String name; 
    private String shipping_address; 
    private String email_address;
    
    public Customer(String idNo,String name,String shipping_address,String email_address)
        {
        this.idNo=idNo;
        this.name=name;
        this.shipping_address=shipping_address;
        this.email_address=email_address;
        
        }       

@Override
    public String toString()
    {
        return String.format("\nRecipt\n\nCustomer Details\nThe Customer ID: %s%nThe Customer name: %s%nShipping Address: %s%nEmail Address: %s%n",idNo,name,shipping_address,email_address);
    }


}