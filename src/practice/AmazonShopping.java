package practice;

public class AmazonShopping {

	public static void main(String[] args) {
		
		Shopping shop = new Shopping();
		
		//sc1
		shop.login("azam@gmail.com", "azam@123")
		        .search("T-shirt")
		              .addToCart("T-Shirt")
		                      .doPayment("12 12 12 12 12 12", 123)
		                              .generateOrder()
		                                  .logout();
		                                    
		     
		//sc2
		
		shop.login("azam@gmail.com", "azam@123")
		                 .search("macbook")
		                       .addToCart("macbook")
		                              .logout();
		
		
		//sc3
		shop.login("azam@gmail.com", "azam@123")
		                 .doPayment("\"12 12 12 12 12 12\", 123")
		                         .generateOrder().logout();
	

		//sc4
		shop.login("azam@gmail.com", "azam@123")
		          .logout();
	}

}
