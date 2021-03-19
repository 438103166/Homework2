//this is  object
// it will print two mobiles  
public class Mobile {
String Kind;
int Storage;
String color;
int price;

Mobile(){
	
}
Mobile(String newKind,int newStorage,String newColor,int newPrice){
Kind=newKind;
Storage=newStorage;
color=newColor;
price=newPrice;
}
String getKind() {
	return Kind;
}
int getPrice() {
	return price;
}
}
