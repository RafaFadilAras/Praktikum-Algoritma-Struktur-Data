public class Warung24 {
        String nama;
        int nomorHP;
    
        public Warung24(){
        }
        Warung24 (String nama, int nomorHP){
            this.nama = nama;
            this.nomorHP = nomorHP;

        }
        Warung24 [] antrian;
        int front;
        int rear;
        int size;
        int max;
    
        public Warung24 (int n) {
            max = n;
            antrian = new Warung24 [max];
            size = 0;
            front = rear = -1;
        }
        public boolean IsEmpty(){
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }
        public boolean IsFull(){
            if (size == max) {
                return true;
            } else {
                return false;
            }
        }
        public void Enqueue(Warung24 dt) {
            if (IsFull()) {
                System.out.println("Queue sudah penuh");
            } else {
                if (IsEmpty()) {
                    front = rear = 0;
                } else {
                    if (rear == max - 1) {
                        rear = 0;
                    } else {
                        rear++;
                    }
                }
                antrian[rear] = dt;
                size++;
            }
        }
        public Warung24 Dequeue() {
            Warung24 dt = new Warung24();
            if (IsEmpty()) {
                System.out.println("Queue masih kosong");
            } else {
                dt = antrian[front];
                size--;
                if (IsEmpty()) {
                    front = rear = -1;
                } else {
                    if (front == max -1){
                        front = 0;
                    } else {
                        front++;
                    }
                }
            }
            return dt;
        }
        public void print() {
            if (IsEmpty()) {
                System.out.println("Queue masih kosong");
            } else {
                int i = front;
                while (i != rear) {
                    System.out.println(antrian[i].nama + " " + antrian[i].nomorHP);
                    i = (i + 1) % max;
                }
                System.out.println(antrian[i].nama + " " + antrian[i].nomorHP);
                System.out.println("Jumlah elemen = " + size );
            }
        }
        public void peek() {
            if(!IsEmpty()){
                System.out.println("Pelanggan terdepan : " + antrian[front].nama);
            } else {
                System.out.println("Antrian masih kosong");
            }
        }
        public void peekRear() {
            if(!IsEmpty()) {
                System.out.println("Atrian Pelanggan posisi belakang : " + antrian[rear].nama);
            } else {
                System.out.println("Antrian masih kosong");
            }
        }
        public void peekPosition(String nama) {
            int posisi = -1;
            for (int i = 0; i < size; i++) {
                if (antrian[i].nama.equalsIgnoreCase(nama)){
                    posisi = i + 1;
                    break;
                }
            }
            if (posisi != -1) {
                System.out.println("Pelanggan " + nama + " berada di posisike-" + posisi);
            } else {
                System.out.println("Pelanggan " + nama + " tidak ditemukan dalam antrian");
            }
        }
        public void daftarPelanggan() { 
            if (IsEmpty()) {
                System.out.println("Antrian masih kosong");
            } else {
                System.out.println("Daftar Pelanggan dalam Antrian : ");
                int i = front;
                do {
                    System.out.println(antrian[i].nama);
                    i = (i + 1) % max;
                } while (i != rear);
                System.out.println(antrian[i].nama);
            }
        }
    }
    
