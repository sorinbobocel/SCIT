public class FestivalStatisticsThread extends Thread {

    private FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
        try {
            currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (gate.gateQueue.size() != 0) {
            gate.gatherStatisticalData();
            try {
                currentThread().sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
