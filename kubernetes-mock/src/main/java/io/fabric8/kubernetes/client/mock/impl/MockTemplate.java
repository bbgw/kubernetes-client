/**
 * Copyright (C) 2015 Red Hat, Inc.                                        
 *                                                                         
 * Licensed under the Apache License, Version 2.0 (the "License");         
 * you may not use this file except in compliance with the License.        
 * You may obtain a copy of the License at                                 
 *                                                                         
 *         http://www.apache.org/licenses/LICENSE-2.0                      
 *                                                                         
 * Unless required by applicable law or agreed to in writing, software     
 * distributed under the License is distributed on an "AS IS" BASIS,       
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and     
 * limitations under the License.
 */

package io.fabric8.kubernetes.client.mock.impl;

import io.fabric8.kubernetes.client.OpenShiftClient;
import io.fabric8.kubernetes.client.dsl.ProcessableClientResource;
import io.fabric8.kubernetes.client.mock.BaseMockOperation;
import io.fabric8.kubernetes.client.mock.MockProcessableResource;
import io.fabric8.openshift.api.model.DoneableTemplate;
import io.fabric8.openshift.api.model.Template;
import io.fabric8.openshift.api.model.TemplateList;

public class MockTemplate extends BaseMockOperation<OpenShiftClient, Template, TemplateList, DoneableTemplate,
  ProcessableClientResource<Template, DoneableTemplate>,
  MockProcessableResource<Template, DoneableTemplate, Boolean>> {
}