package bookaroom.dto;

import bookaroom.models.room.RoomModel;

public class TypeCountDTO {
    private RoomModel.TypeRoom type;
    private Long count;

    public TypeCountDTO(RoomModel.TypeRoom type, Long count) {
        this.type = type;
        this.count = count;
    }

    public RoomModel.TypeRoom getType() {
        return type;
    }

    public Long getCount() {
        return count;
    }
}

