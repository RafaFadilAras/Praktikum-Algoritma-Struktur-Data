public class HotelService24 {
    Hotel24 rooms [] = new Hotel24[5];
    int idx;

    void tambah(Hotel24 r) {
        if (idx < rooms.length) {
            rooms [idx] = r;
            idx++;
        } else {
            System.out.println("Kamar tidak tersedia");
        }
    }
    void tampil() {
        for (Hotel24 r : rooms) {
            r.tampil();
            System.out.println("============================");
        }
    }
    void bubbleSort() {
        for(int i=0; i<rooms.length-1; i++){
            for(int j=1; j<rooms.length-i; j++){
                if(rooms[j].harga > rooms[j-1].harga){
                    Hotel24 tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int i=0; i<rooms.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<rooms.length; j++){
                if(rooms[j].bintang > rooms[idxMin].bintang){
                    idxMin = j;
                }
            }
            Hotel24 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
