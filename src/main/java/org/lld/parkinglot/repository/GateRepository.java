package org.lld.parkinglot.repository;

import org.lld.parkinglot.models.Gate;
import org.lld.parkinglot.models.GateType;
import org.lld.parkinglot.models.Operator;

import java.util.*;
import java.util.stream.Collectors;

public class GateRepository {

    private static Map<Integer, Gate> gates;

    private static volatile  GateRepository instance;

    private GateRepository() {}

    public static GateRepository getInstance() {
        if (instance == null) {
            synchronized (GateRepository.class) {
                if (instance == null) {
                    gates = new TreeMap<>();
                    gates.put(1,new Gate(1,"1", GateType.Enter,new Operator(1,"opr1")));
                    gates.put(2,new Gate(2,"2", GateType.Enter,new Operator(2,"opr2")));
                    gates.put(3,new Gate(3,"3", GateType.Enter,new Operator(3,"opr3")));

                    gates.put(4,new Gate(4,"4", GateType.Exit,new Operator(1,"opr1")));
                    gates.put(5,new Gate(5,"5", GateType.Exit,new Operator(2,"opr2")));
                    gates.put(6,new Gate(6,"6", GateType.Exit,new Operator(3,"opr3")));


                }
            }
        }
        return instance;
    }




    public Optional<Gate> findById(int id) {
        return Optional.of(gates.get(id));
    }

    public List<Gate> findAll() {
        return new ArrayList<>(gates.values());
    }

    public List<Gate> findByExit() {
        return gates.values().stream()
                .filter(gate -> gate.getGateType() == GateType.Exit)
                .collect(Collectors.toList());
    }

    public List<Gate> findByEnter() {
        List<Gate> result = new ArrayList<>();
        for (Gate gate : gates.values()) {
            if(gate.getGateType() == GateType.Enter){
                result.add(gate);
            }
        }
        return result;
    }
}
