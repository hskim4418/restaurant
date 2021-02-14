package restaurant;

import restaurant.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class MyPageViewHandler {


    @Autowired
    private MyPageRepository myPageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenReserved_then_CREATE_1 (@Payload Reserved reserved) {
        try {
            if (reserved.isMe()) {
                // view 객체 생성
                  = new ();
                // view 객체에 이벤트의 Value 를 set 함
                .setRestaurantNo(.getRestaurantNo());
                .setDay(.getDay());
                // view 레파지 토리에 save
                Repository.save();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenReserveAccepted_then_UPDATE_1(@Payload ReserveAccepted reserveAccepted) {
        try {
            if (reserveAccepted.isMe()) {
                // view 객체 조회
                List<> List = Repository.findByReservationNo(.getReservationNo());
                for(  : List){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    // view 레파지 토리에 save
                    Repository.save();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}