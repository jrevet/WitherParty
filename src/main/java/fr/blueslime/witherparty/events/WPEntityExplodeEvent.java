package fr.blueslime.witherparty.events;

import fr.blueslime.witherparty.WitherParty;
import fr.blueslime.witherparty.arena.Arena;
import fr.blueslime.witherparty.arena.MusicTable;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityExplodeEvent;

import java.util.UUID;

public class WPEntityExplodeEvent extends AbstractEvent<EntityExplodeEvent>
{
    public WPEntityExplodeEvent(WitherParty plugin, Arena arena)
    {
        super(plugin, arena);
    }

    @Override
    public void event(EntityExplodeEvent event)
    {
        if(event.getEntityType() == EntityType.WITHER_SKULL)
        {
            if(event.getEntity().hasMetadata("to-destroy"))
            {
                UUID toDestroy = UUID.fromString(event.getEntity().getMetadata("to-destroy").get(0).asString());
                MusicTable musicTable = this.arena.getPlayerTable(toDestroy);


            }
        }
    }
}