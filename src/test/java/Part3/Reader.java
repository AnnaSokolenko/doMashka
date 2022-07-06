package Part3;

        public class Reader {
           private String fullName;
           private int phoneNumber;
           private int readerTicketNumber;
           private int readerBook;
           private int libraryBook;
           private int returnBook;


           public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public int getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(int phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public int getReaderTicketNumber() {
                return readerTicketNumber;
            }

            public void setReaderTicketNumber(int readerTicketNumber) {
                this.readerTicketNumber = readerTicketNumber;
            }
            public int getReaderBook() {
                return readerBook;
            }

            public void setReaderBook(int readerBook) {
                this.readerBook = readerBook;
            }
            public int getLibraryBook() {
                return libraryBook;
            }

            public void setLibraryBook(int libraryBook) {
                this.libraryBook = libraryBook;
            }
            public int getReturnBook() {
                return returnBook;
            }

            public void setReturnBook(int returnBook) {
                this.returnBook = returnBook;
            }
            public void takeBooks(){
                int Books = getReaderBook()+getLibraryBook();
                if (getReaderBook() + getLibraryBook() <= 5){
                    System.out.println("Reader " + getFullName() + " take " + getLibraryBook()+ " the books he has "+ Books);
                }else if (getReaderBook() + getLibraryBook() >= 5){
                    System.out.println("limit exceeded "+ Books +", fine " + (Books-5)*50);
                }else {
                    System.out.println("incorrect value");
                }
           }
                public void returnBooks() {
                int Books = getReaderBook() - getReturnBook();
                if (getReaderBook() - getReturnBook() == 0){
                    System.out.println(getFullName() + " All books returned, reader ticket number - " + getReaderTicketNumber());
                }else if (getReaderBook() - getReturnBook() > 5){
                    System.out.println(getFullName()+ "Now" + getFullName() + " has a debt of"+ (getReaderBook()-5)*50 + "hryvnas \n If you return the missing books " +
                            "your fine will be"+(Books-5)*50+ "by number"+getReaderTicketNumber() + " phone number "+ getPhoneNumber());
                }else if(getReaderBook() > 5){
                    System.out.println(getFullName()+ " You have no dept" + getReturnBook() + " books. You have a fine for last month"+ (getReaderBook()-5)*50);
                } else {
                    System.out.println("Error, "+ getFullName()+" trying to return extra books, check information on the reader ticket number"+ getReaderTicketNumber());
                }
            }

            public static void main(String[] args) {
                Reader Artur = new Reader();
                Artur.setFullName("Vodyanka Artur Kastratovich");
                Artur.setReaderBook(3);
                Artur.setLibraryBook(3);
                Artur.setReturnBook(1);
                Artur.takeBooks();
                Artur.returnBooks();
                Artur.setReaderTicketNumber(13577);
                Artur.setPhoneNumber(734503350);

                Reader Emiliya = new Reader();
                Emiliya.setFullName("Kombucha Emiliya Pohuevna");
                Emiliya.setReaderBook(2);
                Emiliya.setLibraryBook(3);
                Emiliya.setReturnBook(1);
                Emiliya.takeBooks();
                Emiliya.returnBooks();
                Emiliya.setReaderTicketNumber(13579);
                Emiliya.setPhoneNumber(995607890);

            }

        }


