/*
 * Copyright 2021 SOUP
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package soup.movie.feature.settings

import androidx.annotation.Keep
import soup.movie.feature.theme.ThemeOption
import soup.movie.model.TheaterModel

sealed class SettingsUiModel

@Keep
data class TheaterSettingUiModel(
    val theaterList: List<TheaterModel>,
) : SettingsUiModel()

@Keep
data class VersionSettingUiModel(
    val versionCode: Int,
    val versionName: String,
    val isLatest: Boolean,
) : SettingsUiModel()

@Keep
data class ThemeSettingUiModel(
    val themeOption: ThemeOption,
)
