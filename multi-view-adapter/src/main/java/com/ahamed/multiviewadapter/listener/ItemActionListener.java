/*
 * Copyright 2017 Riyaz Ahamed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ahamed.multiviewadapter.listener;

import android.support.annotation.RestrictTo;
import com.ahamed.multiviewadapter.BaseViewHolder;

@RestrictTo(RestrictTo.Scope.LIBRARY) public interface ItemActionListener {

  void onItemSelectionToggled(int position);

  void onItemExpansionToggled(int position);

  void onGroupExpansionToggled(int position);

  boolean isItemSelected(int position);

  boolean isItemExpanded(int adapterPosition);

  boolean isAdapterInActionMode();

  void onStartDrag(BaseViewHolder viewHolder);
}
