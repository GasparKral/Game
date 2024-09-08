package models.interfaces;

import java.util.ArrayList;

public interface Subscription {

    public interface Subscribeable {

        public ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();

        public default void subscribe(Subscriber subscriber) {

            subscribers.add(subscriber);
        };

        public default void unsubscribe(Subscriber subscriber) {

            subscribers.remove(subscriber);
        };

        public default void notifySubscribers() {

            for (Subscriber subscriber : subscribers) {
                notifySubscriber(subscriber);
            }
        };

        public default void notifySubscriber(Subscriber subscriber) {

            subscriber.update();
        };

    }

    public interface Subscriber {

        public void update(Object o);

        public void update();

        public void update(Subscribeable subscribeable);

        public void update(Subscribeable subscribeable, Object o);

    }

}
