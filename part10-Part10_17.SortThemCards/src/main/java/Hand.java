
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ania
 */
public class Hand implements Comparable <Hand> {
    
    private List <Card> cardsInHand;

    public Hand() {
        this.cardsInHand = new ArrayList <>();
    }
    
    public void add(Card card) {
        this.cardsInHand.add(card);
    }
    
    public void print() {
        for(Card e: this.cardsInHand) {
            System.out.println(e);
        }
    }
//        this.cardsInHand.stream().forEach(cards -> {
//            System.out.println(cards);
//        });
//        }
    
    
    public void sort() {
        Collections.sort(this.cardsInHand);
    }
    
        public void sortBySuit() {
        Collections.sort(this.cardsInHand, new BySuitInValueOrder());
    }
    
    @Override
    public int compareTo(Hand hand) {
        int thisHand = this.cardsInHand.stream()
                .map(card -> card.getValue())
                .reduce(0, (previousSum, card) -> previousSum + card);
        
        int otherHand = hand.cardsInHand.stream()
                .map(card -> card.getValue())
                .reduce(0, (previousSum, card) -> previousSum + card);
        
        return thisHand - otherHand;
    }
    
    
}
