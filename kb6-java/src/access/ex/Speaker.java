package access.ex;

public class Speaker {
    private boolean power = false;
    private int volume;

    void powerOn() {
        if (power) {
            System.out.println("이미 전원이 켜져 있습니다");
            return;
        }
        this.power = true;
        System.out.println("전원을 켭니다");

    }
    void powerOff() {
        if (!power) {
            System.out.println("전원을 먼저 켜야 합니다");
            return;
        }
        this.power = false;
        System.out.println("전원을 끕니다");
    }
    void volumeUp() {
        if (!checkPower()) {
            return;
        }
        if (this.volume >= 100) {
            System.out.println("더 이상 볼륨을 올릴 수 없습니다");
            return;
        }
        this.volume++;
        printVolume();
    }
    void volumeDown() {
        if (!checkPower()) {
            return;
        }
        if (this.volume <= 0) {
            System.out.println("더 이상 볼륨을 내릴 수 없습니다");
            return;
        }
        this.volume--;
        printVolume();
    }

    boolean checkPower() {
        if (!power) {
            System.out.println("전원을 먼저 켜주세요");
            return false;
        }
        return true;
    }
    void printVolume() {
        System.out.println("현재 Volume : " + this.volume);
    }
}
