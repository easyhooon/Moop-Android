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
package soup.movie.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import soup.movie.system.SystemViewModel
import soup.movie.ui.MovieTheme
import soup.movie.ui.windowsizeclass.calculateWindowSizeClass

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private val systemViewModel: SystemViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                MovieTheme {
                    val viewModel = hiltViewModel<HomeViewModel>()
                    HomeScreen(
                        widthSizeClass = calculateWindowSizeClass(requireActivity()).widthSizeClass,
                        viewModel = viewModel,
                        onNavigationClick = {
                            systemViewModel.openNavigationMenu()
                        }
                    ) { movie ->
                        findNavController().navigate(HomeFragmentDirections.actionToDetail(movie))
                    }
                }
            }
        }
    }
}
