package chapter3.ch16.scheduler;

public class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 대기가 적은 상담원 우선 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("상담 전화를 대기가 적은 상담원 우선 가져옵니다.");
    }
}
