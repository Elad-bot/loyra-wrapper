import { OSNotification } from "./OSNotification";
export declare class NotificationWillDisplayEvent {
    private notification;
    constructor(displayEvent: OSNotification);
    /**
     * Call this to prevent OneSignal from displaying the notification automatically.
     * This method can be called up to two times with false and then true, if processing time is needed.
     * Typically this is only possible within a short
     * time-frame (~30 seconds) after the notification is received on the device.
     * @param discard an [preventDefault] set to true to dismiss the notification with no
     * possibility of displaying it in the future.
     */
    preventDefault(discard?: boolean): void;
    getNotification(): OSNotification;
}
