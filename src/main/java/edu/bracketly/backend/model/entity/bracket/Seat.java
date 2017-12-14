package edu.bracketly.backend.model.entity.bracket;

import edu.bracketly.backend.model.entity.BaseEntity;
import edu.bracketly.backend.tree.Node;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;
import java.util.Set;

/**
 * Created by Piotr Borczyk on 06.11.2017.
 */

@Entity
@EqualsAndHashCode(callSuper = true, exclude = {"children"})
@Data
public class Seat extends BaseEntity implements Node {
    private Player player;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Seat> children;

    @OneToOne(cascade = CascadeType.ALL)
    private Seat parent;
    private boolean isLeaf;
    private int depth;
    private int number;
}