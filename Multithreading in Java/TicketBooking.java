class TicketCounter {
    private int availableSeats;

    TicketCounter(int seats) {
        availableSeats = seats;
    }
    public synchronized void bookTicket(int seats) {

        System.out.println(Thread.currentThread().getName() + " trying to book " + seats + " seats");

        if (availableSeats >= seats) {
            System.out.println("Booking successful for " + Thread.currentThread().getName());

            availableSeats -= seats;

            System.out.println("Seats left: " + availableSeats);
        } else {
            System.out.println("Booking failed for " + Thread.currentThread().getName() + " (Not enough seats)");
        }

        System.out.println("-----------------------------");
    }
}

class User extends Thread {
    TicketCounter counter;
    int seats;

    User(TicketCounter c, int seats) {
        counter = c;
        this.seats = seats;
    }

    public void run() {
        counter.bookTicket(seats);
    }
}

public class TicketBooking {
    public static void main(String[] args) {

        TicketCounter counter = new TicketCounter(10);

        User u1 = new User(counter, 4);
        User u2 = new User(counter, 5);
        User u3 = new User(counter, 3);

        u1.setName("User-1");
        u2.setName("User-2");
        u3.setName("User-3");

        u1.start();
        u2.start();
        u3.start();
    }
}