package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     *
     * @param froggerID   ID of the frogger
     */
    public boolean addRecord(FroggerID froggerID) {
        for (FroggerID id: this.records) {
            if (id.equals(froggerID))
                return false;
        }
        this.records.add(froggerID);
        return true;
    }
}