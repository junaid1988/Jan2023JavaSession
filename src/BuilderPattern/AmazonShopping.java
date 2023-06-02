package BuilderPattern;

public class AmazonShopping {

	public static void main(String[] args) {
		
		Shopping shop  = new Shopping();
		
		//sc1
		shop.login("azam123@gmail.com", "abc@123")
		          .search("T-shirt")
		              .addToCart("T-shirt")
		                  .doPayment("123123123123", 234)
		                      .generateOrder()
		                          .logout();
		
		//sc2
		
		shop.login("azam123@gmail.com", "abc@123")
		        .addToCart("macbook")
		            .doPayment("123456788888", 124);
		
		//sc3 
		shop.login("azam123@gmail.com", "abc@123")
		               .doPayment("123123123123", 234)
		                     .generateOrder().logout();
		
		//sc4
		shop.login("azam123@gmail.com", "abc@123").logout();
		
		//sc5
		shop.login("azam123@gmail.com", "abc@123")
		        .logout()
		                .login("azam123@gmail.com", "abc@123");
		
		          
		
		          
		
		               
		

	}

}
