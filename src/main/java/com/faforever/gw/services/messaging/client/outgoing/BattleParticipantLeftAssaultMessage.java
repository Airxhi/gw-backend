package com.faforever.gw.services.messaging.client.outgoing;

import com.faforever.gw.model.Faction;
import com.faforever.gw.security.User;
import com.faforever.gw.services.messaging.client.AbstractOutgoingWebSocketMessage;
import lombok.Data;

import java.util.Collection;
import java.util.UUID;

@Data
public class BattleParticipantLeftAssaultMessage extends AbstractOutgoingWebSocketMessage {
    private UUID characterId;
    private UUID battleId;
    private Faction attackingFaction;
    private Faction defendingFaction;

    public BattleParticipantLeftAssaultMessage(Collection<User> connectedUsers, UUID characterId, UUID battleId, Faction attackingFaction, Faction defendingFaction) {
        super(connectedUsers, null);

        this.characterId = characterId;
        this.battleId = battleId;
        this.attackingFaction = attackingFaction;
        this.defendingFaction = defendingFaction;
    }
}
