package cadenaresponsabilidad;

public interface Assistant
{
    void setNext(Assistant assistant);
    void handle(HelpDeskRequest helpDeskRequest);
}
