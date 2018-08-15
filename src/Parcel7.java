public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        Contents c = parcel7.contents();
    }
}

interface Contents {
    int value();
}
