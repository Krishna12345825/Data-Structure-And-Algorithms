package TapDSA.Arrays;
public class Q30TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height));
    }

    public static int trap(int[] arr) {
        int res = 0;
        for (int i = 1; i <= arr.length - 2; i++) {
            int lb = arr[i];
            for (int j = 0; j < i; j++) {
                if (arr[j] > lb) {
                    lb = arr[j];
                }
            }
            int rb = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > rb) {
                    rb = arr[j];
                }
            }
            int wl;
            if (rb > lb) {
                wl = lb;
            } else {
                wl = rb;
            }
            int tw = wl - arr[i];
            res = res + tw;
        }
        return res;
    }
}