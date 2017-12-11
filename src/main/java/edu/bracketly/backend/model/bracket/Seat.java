package edu.bracketly.backend.model.bracket;

import edu.bracketly.backend.tree.Node;
import lombok.*;

import java.util.Set;

/**
 * Created by Piotr Borczyk on 06.11.2017.
 */

@Getter
@Setter
@NoArgsConstructor
@ToString(of = {"number", "depth"})
public class Seat implements Node {
    private Player player;
    private Set<Seat> children;
    private Seat parent;
    private boolean isLeaf;
    private int depth;
    private int number;
}