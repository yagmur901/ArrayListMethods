public class MyArrayList {


    //Temel ArrayList metotlarının MyArrayList ile yazılmış halleri (String[] ile):



    private String[] data;
    private int size;

    public MyArrayList() {
        data = new String[5];
        size = 0; // eleman sayısı
    }


    public void add(String value) { //listenin sonuna ekler.

        if (size == data.length) {
            String[] newData = new String[size*2];

            for(int i= 0; i< size;i++) {
                newData[i] = data[i];

            }

            data = newData;

        }
        data[size] = value;
        size++;


    }

    public void add(int index, String value) { //belirtilen indeks numarasına yerleştirir (mevcut elemanlar sağa kayar).

        if (index < 0 || index>= size) {System.out.println("Invalid index."); return;}


        if (size == data.length) {
            String[] newData = new String[size*2];

            for(int i= 0; i< size;i++) {
                newData[i] = data[i];

            }

            data = newData;

        }
        for (int i = size; i> index; i--) {
            data[i] = data[i-1];
        }

        data[index] = value;
        size++;

    }







    public void remove(int index) { //belirtilen indeksteki elemanı listeden kaldırır.
        if (index < 0 || index>= size) {System.out.println("Invalid index."); return;}

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        size--;
    }

    public String get(int index) { //belirtilen indeksteki elemanı getirir.
        if (index < 0 || index>= size) {System.out.println("Invalid index."); return null;}
        return data[index];
    }

    public int size(){ //liste boyutunu döndürür.
        return size;
    }

    public void set(int index, String value) { //belirtilen indeksteki elemanı günceller.
        if (index < 0 || index>= size) {System.out.println("Invalid index."); return;}
        data[index] = value;
    }

    public boolean isEmpty(){ //listenin boş olup olmadığını kontrol eder.
        if (size== 0) {return true;}
        else {return false;}
    }

    public void clear(){ //listedeki tüm elemanları siler, listeyi boşaltır.
        for (int i = 0; i< size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public int indexOf(String value) { //aranan elemanın ilk bulunduğu indeks numarasını döndürür (bulamazsa -1).
        for (int i = 0; i< size; i++) {
            if (data[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(String value) { //aranan elemanın listede olup olmadığını döndürür.
        for (int i = 0; i< size; i++) {
            if (data[i].equals(value)) {
                return true;
            }
        }
        return false;
    }



}
