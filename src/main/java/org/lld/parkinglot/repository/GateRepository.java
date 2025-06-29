package org.lld.parkinglot.repository;

import org.lld.parkinglot.models.Gate;
import org.lld.parkinglot.models.GateType;
import org.lld.parkinglot.models.Operator;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {

    Map<Integer, Gate> gates;

    public GateRepository() {
        gates = new TreeMap<>();
        gates.put(1,new Gate(1,"1", GateType.Enter,new Operator(1,"opr1")));
        gates.put(2,new Gate(2,"2", GateType.Enter,new Operator(2,"opr2")));
        gates.put(3,new Gate(3,"3", GateType.Enter,new Operator(3,"opr3")));
    }

    public Optional<Gate> findById(int id) {
        return Optional.of(gates.get(id));
    }
}
