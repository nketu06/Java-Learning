package org.lld.parkinglot.models;

public class Gate extends BaseModel{

    private String number;
    private GateType gateType;
    private GateStatus gateStatus;
    private Operator operator;

    public Gate(int id,String string, GateType gateType,  Operator operator) {
        super(id);
        this.number = string;
        this.gateType = gateType;
        this.gateStatus = GateStatus.OPEN;
        this.operator = operator;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }


}
