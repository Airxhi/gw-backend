package com.faforever.gw.services.messaging.client;

import com.faforever.gw.model.Faction;
import com.faforever.gw.security.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Collection;

public interface OutgoingWebSocketMessage extends Serializable {
    @JsonIgnore
    default Faction getFaction() { return null; }
    @JsonIgnore
    default Collection<User> getRecipients() { return null; }
}
