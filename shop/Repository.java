import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Repository {
    List<Product> listProducts = new ArrayList<>();

    public Repository() {
        listProducts.add(new Product("01","Bánh Doraemon 3 vị", Category.FOOD,100,3500,57));
        listProducts.add(new Product("02","Xúc xích sườn non", Category.FOOD,150,3500,12));
        listProducts.add(new Product("03","Thanh cua", Category.FOOD,100,5000,85));
        listProducts.add(new Product("04","Bánh khoai môn", Category.FOOD, 200,42000,78));
        listProducts.add(new Product("05","Thìa ăn cơm inox mạ vàng", Category.HOUSEWARE,65,8000,4));
        listProducts.add(new Product("06","Bát đựng gia vị", Category.HOUSEWARE,65,400,44));
        listProducts.add(new Product("07","Nước Hoa Hồng Soothing Facial Toner Simle", Category.COSMETICS,140,92000,88));
        listProducts.add(new Product("08","Combo gội xả HAIRBURST", Category.COSMETICS,100,639000,7));
        listProducts.add(new Product("09","Tinh chất dưỡng ẩm sâu Klai Rich Moist Soothing Serun", Category.COSMETICS,50,249000,24));
        listProducts.add(new Product("10","Kem dưỡng thể Puula's Choice REST WEIGHTLESS BODY TREATMENT",Category.COSMETICS,80,715000,63));
        listProducts.add(new Product("11","Áo thun TSUN", Category.FASHION, 250,320000,146));
    }
    public void show(){
        //Sử dụng foreach
        // for (Product product : listProductS){
        //     System.out.println(product);
        //}

        //Sử dụng lambda
        listProducts.forEach(product -> System.out.println(product));
    }

    public void sortProductByName(){
        //Sử dụng comparator
        //listProducts.sort(new Comparator<Product>(){

        //    @Override
        //    public int compare(Product o1, Product o2) {
        //       return o1.getName().compareTo(o2.getName());
        //    }

        // });

        //sử dụng lambda
        listProducts.sort((o1,o2) -> getName().compareTo(o2.getName()));

    }
    public void filterProductByPrice(){
//        for (Product product : listProducts) {
//            if(product.getPrice() > 10000){
//                System.out.println(product);
//            }
//        }
//        Sử dụng lambda và stream
        listProducts.stream()
                .filter(product -> product.getAmount() > 1000)
                .forEach(product -> System.out.println(product));
    }

    public void countProductByAmountSale(){
        long count = listProducts.stream()
                .filter(product -> product.getAmountSale() >=50)
                .count();

        System.out.println("Số lượng sản phẩm bán được từ 50 trở lên là: " + count);
    }
}
