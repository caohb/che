/*
 * Copyright (c) 2012-2017 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.api.vcs;

import org.eclipse.che.api.promises.client.Promise;

/** Indicates that the editor can handle VCS change markers. */
public interface HasVcsChangeMarkerRender {

  /** Returns new, or created instance (if was created earlier) of {@link VcsChangeMarkerRender}. */
  Promise<VcsChangeMarkerRender> getOrCreateVcsMarkRender();
}