/*
 * Copyright 2010 The gwtquery plugins team.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package gwtquery.plugins.draggable.client.plugins;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.plugins.UiPlugin.Event;

import gwtquery.plugins.draggable.client.DraggableHandler;
import gwtquery.plugins.draggable.client.DraggableOptions;

public interface DraggablePlugin {

  String getName();

  boolean hasToBeExecuted(DraggableOptions options);

  void onDrag(DraggableHandler handler, Element draggableElement, Event e);

  void onStart(DraggableHandler handler, Element draggableElement, Event e);

  void onStop(DraggableHandler handler, Element draggableElement, Event e);
}