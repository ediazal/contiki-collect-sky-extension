/*
 * NodeSink
 *
 * Author  : Eloy Díaz <eldial@gmail.com>
 * Created : 30 sep 2012
 */

package org.contikios.contiki.collect.platform;

import org.contikios.contiki.collect.Node;
import org.contikios.contiki.collect.SensorInfo;

public class NodeSink extends Node implements SensorInfo {

  public NodeSink(String nodeID) {
    super(nodeID);
    init();
  }
  
  public NodeSink(String nodeID, String nodeName){
    super(nodeID,nodeName);
    init();
  }
  
  @Override
  public void init() {
    setNodeType();
  }
  
  @Override
  public void addSensors() {}

  @Override
  public void mapMsgFormat() {}

  @Override
  public void setNodeType() {
    type="Sink";    
  }
  @Override
  public void setPlatformADCResolution() {}

  @Override
  public void copySensorsFrom(Node n) {}
}
