public class InitStage extends Stage {

    public InitStage(InterStageStorage<Widget> _nextQueue, int _M, int _N, String _ID){
        nextQueue = _nextQueue;

        setProductionParameters(_M, _N);
        parallelStage = 1;

        ID = _ID;
    }

    public InitStage(InterStageStorage<Widget> _nextQueue, int _M, int _N, String _ID, int _parallelStage){
        this(_nextQueue, _M, _N, _ID);

        parallelStage = _parallelStage;
    }
}
