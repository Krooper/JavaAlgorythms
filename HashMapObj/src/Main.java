public class Main {
    public static void main(String[] args) {
        HashMapObj hshmp = new HashMapObj();
        for (int i = 0; i < 16; i++) {
            hshmp.put(i + 1, i);
        }

        System.out.println("Size: " + hshmp.size());
        System.out.println("9th element exists: " + hshmp.containsKey(9));
        System.out.println("9th element value: " + hshmp.get(9));
        System.out.println("HashMap contains value \"8\" : " + hshmp.containsValue(8));
        System.out.println("HashMap contains value \"123456789\" : " + hshmp.containsValue(123456789));

        System.out.println();

        hshmp.replays(9, 123456789);
        System.out.println("Size: " + hshmp.size());
        System.out.println("9th element exists: " + hshmp.containsKey(9));
        System.out.println("9th element value: " + hshmp.get(9));
        System.out.println("HashMap contains value \"8\" : " + hshmp.containsValue(8));
        System.out.println("HashMap contains value \"123456789\" : " + hshmp.containsValue(123456789));

        System.out.println();

        hshmp.remove(9);
        System.out.println("Size: " + hshmp.size());
        System.out.println("9th element exists: " + hshmp.containsKey(9));
        System.out.println("9th element value: " + hshmp.get(9));
        System.out.println("HashMap contains value \"8\" : " + hshmp.containsValue(8));
        System.out.println("HashMap contains value \"123456789\" : " + hshmp.containsValue(123456789));

        System.out.println();

        hshmp.remove(1);
        hshmp.remove(2);
        hshmp.remove(3);
        System.out.println("Size: " + hshmp.size());

        System.out.println();

        hshmp.remove(195);
        hshmp.remove(3954);
        hshmp.remove(35);
        System.out.println("Size: " + hshmp.size());
    }
}
