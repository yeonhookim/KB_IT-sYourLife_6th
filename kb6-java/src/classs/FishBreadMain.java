package classs;

public class FishBreadMain {
    public static void main(String[] args) {
        FishBread fish1 = new FishBread("슈크림", "붕어", 500);
        FishBread fish2 = new FishBread();

//        fish1.taste = "슈크림";
//        fish1.shape = "잉어";
//        fish1.price = 800;

        fish1.printFishBread();
        fish2.printFishBread();
    }
}
